package de.mindscan.json;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExportToJson {
	
	private static final String BEGIN_ARRAY = "[ ";
	private static final String BEGIN_OBJECT = "{\n";
	private static final String END_ARRAY = "]";
	private static final String END_OBJECT = "}";
	private static final String NAME_SEPARATOR = " : ";
	private static final String VALUE_SEPARATOR = ",\n";
	private static final String VALUE_SEPARATOR_NNL = ",";
	
	private static char toHEX[] = {
			'0','1','2','3', //
			'4','5','6','7', //
			'8','9','A','B', //
			'C','D','E','F' };
	
	// weired xtend sh*t what i don't want do deal with right now
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String asJsonString(LinkedHashMap<String, HashMap<String, ?>> map) {
		StringBuilder sb = new StringBuilder();

		HashMap untypedHashMap = new LinkedHashMap(map);
		writeMapToJson(sb, untypedHashMap,0);
		
		return sb.toString();
	}
	
	@SuppressWarnings("unchecked")
	private void writeMapToJson(StringBuilder sb, Map<String, Object> map, int indent) {
		sb.append(BEGIN_OBJECT);
		int currentIndent = indent+1;
		appendIndent(sb,currentIndent);

		if (map != null && map.size()>0) {
			boolean isFirst = true;
			
			for (String key : map.keySet()) {
				Object value = map.get(key);
				
				if(!isFirst) {
					sb.append(VALUE_SEPARATOR);
					appendIndent(sb,currentIndent);
				}
				isFirst = false;
				
				writeStringKey(sb, key);
				
				sb.append(NAME_SEPARATOR);

				if(value != null) {
					if(value instanceof Boolean) {
						sb.append(value==Boolean.TRUE?"true":"false");
					} else if(value instanceof Number) {
						sb.append(((Number)value).toString());
					} else if(value instanceof String) {
						writeStringValueUTF8(sb, (String)value);
					} else if(value instanceof Map) {
						writeMapToJson(sb, (Map<String,Object>)value, currentIndent);
					} else if(value instanceof List) {
						writeListToJson(sb, (List<Object>)value, currentIndent);
					} else if(isArray(value))
					{
						// probably an array of some primitive....
						sb.append(BEGIN_ARRAY);
						sb.append(END_ARRAY);
					} else {
						// what else?
					}
				} else {
					sb.append("null");
				}
			}
			sb.append("\n");
		}
		
		appendIndent(sb,indent);
		sb.append(END_OBJECT);
	}

	private void appendIndent(StringBuilder sb, int currentIndent) {
		for(int i=0;i<currentIndent;i++) {
			sb.append("  ");
		}
		
	}

	@SuppressWarnings("unchecked")
	private void writeListToJson(StringBuilder sb, List<Object> list, int indent) {
		sb.append(BEGIN_ARRAY);
		
		if(list!=null && list.size()>0) {
			boolean isFirst = true;
			
			
			for (Object value : list) {
				
				if(!isFirst) {
					sb.append(VALUE_SEPARATOR_NNL);
				}
				isFirst = false;
				
				if(value != null) {
					if(value instanceof Boolean) {
						sb.append(value==Boolean.TRUE?"true":"false");
					} else if(value instanceof Number) {
						sb.append(((Number)value).toString());
					} else if(value instanceof String) {
						writeStringValueUTF8(sb, (String)value);
					} else if(value instanceof Map) {
						writeMapToJson(sb, (Map<String,Object>)value,indent);
					} else if(value instanceof List) {
						writeListToJson(sb, (List<Object>)value,indent);
					} else if(isArray(value))
					{
						// probably an array of some primitive....
						sb.append(BEGIN_ARRAY);
						sb.append(END_ARRAY);
					} else {
						// what else
					}
						
				} else {
					sb.append("null");
				}
			}
		}
		
		sb.append(END_ARRAY);
	}
	
	boolean isArray(Object obj) {
	    return obj instanceof Object[] || obj instanceof boolean[] || 
	      obj instanceof byte[] || obj instanceof short[] || 
	      obj instanceof char[] || obj instanceof int[] || 
	      obj instanceof long[] || obj instanceof float[] || 
	      obj instanceof double[];
	}	
	
	private void writeStringKey(StringBuilder sb, String key) {
		sb.append('"');
		// TODO: maybe we have to do some cleanup? / Or do we have to / maybe we need to escape stuff ()
		sb.append(key);
		sb.append('"');
	}
	
	private void writeStringValueUTF8(StringBuilder builder, String valueToEscape) {
		builder.append('"');
		
		// TODO: probably we need to fix this...
		byte[] bytes = valueToEscape.getBytes(StandardCharsets.UTF_8);
				
		for (int i = 0; i < bytes.length; i++) {
			byte c = bytes[i];
			
			if(c == '\\' || c=='"') {
				builder.append('\\');
				builder.append((char)c);
			} else if(c>=0 && c<=0x1f) {
				builder.append('\\');
				switch(c) {
				case '\n':
					builder.append('n');
					break;
				case '\r':
					builder.append('r');
					break;
				case '\t':
					builder.append('t');
					break;
				case '\f':
					builder.append('f');
					break;
				case '\b':
					builder.append('b');
					break;
				default:
					builder.append("u00");
					builder.append(toHEX[(c>>4)&0x1]);
					builder.append(toHEX[(c)&0xF]);
					break;
				}
			} else if(c>=0x0020 && c<=0x7F) {
				builder.append((char)c);
			} else {
				builder.append("\\u");
				builder.append(toHEX[(c>>12)&0xf]);
				builder.append(toHEX[(c>>8)&0xf]);
				builder.append(toHEX[(c>>4)&0xf]);
				builder.append(toHEX[(c)&0xf]);
			}			
			
		}
		
		builder.append('"');
	}
	
}
