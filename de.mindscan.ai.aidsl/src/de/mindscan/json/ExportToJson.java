package de.mindscan.json;

import java.util.List;
import java.util.Map;

public class ExportToJson {
	
	private static final String BEGIN_ARRAY = "[\n";
	private static final String BEGIN_OBJECT = "{\n";
	private static final String END_ARRAY = "]\n";
	private static final String END_OBJECT = "}\n";
	private static final String NAME_SEPARATOR = " : ";
	private static final String VALUE_SEPARATOR = ", \n";

	public String asJsonString(Map<String, Object> map) {
		StringBuilder sb = new StringBuilder();

		writeMapToJson(sb, map);
		
		return sb.toString();
	}

	@SuppressWarnings("unchecked")
	private void writeMapToJson(StringBuilder sb, Map<String, Object> map) {
		sb.append(BEGIN_OBJECT);

		if (map != null && map.size()>0) {
			boolean isFirst = true;
			
			for (String key : map.keySet()) {
				Object value = map.get(key);
				
				if(!isFirst) {
					sb.append(VALUE_SEPARATOR);
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
						writeStringValue(sb, (String)value);
					} else if(value instanceof Map) {
						sb.append("\n");
						writeMapToJson(sb, (Map<String,Object>)value);
					} else if(value instanceof List) {
						writeListToJson(sb, (List<Object>)value);
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
				
				sb.append("\n");
			}
			sb.append("\n");
		}
		
		sb.append(END_OBJECT);
	}

	@SuppressWarnings("unchecked")
	private void writeListToJson(StringBuilder sb, List<Object> list) {
		sb.append(BEGIN_ARRAY);
		
		if(list!=null && list.size()>0) {
			boolean isFirst = true;
			
			
			for (Object value : list) {
				
				if(!isFirst) {
					sb.append(VALUE_SEPARATOR);
				}
				isFirst = false;
				
				if(value != null) {
					if(value instanceof Boolean) {
						sb.append(value==Boolean.TRUE?"true":"false");
					} else if(value instanceof Number) {
						sb.append(((Number)value).toString());
					} else if(value instanceof String) {
						writeStringValue(sb, (String)value);
					} else if(value instanceof Map) {
						sb.append("\n");
						writeMapToJson(sb, (Map<String,Object>)value);
					} else if(value instanceof List) {
						writeListToJson(sb, (List<Object>)value);
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
			sb.append("\n");
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
	
	private void writeStringValue(StringBuilder sb, String value) {
		sb.append('"');
		
		char[] chars = value.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			
			// TODO: output each char and escape the ones we must escape.
			
			
		}
		
		sb.append('"');
	}
	
}
