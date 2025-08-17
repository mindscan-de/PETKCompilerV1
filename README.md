## Idea

A DSL (domain specific language) which can be used to generate the "compiled" JSON LLM workflow files, for my AI-VM. I figured I dislike to write these JSON LLM workflow files by hand. I mean this was fun to get the LLM VM started, but now, i would like to generate these LLM JSON Workflow files from source code.

## Basic Outline

Let's imagine, we don't need to write JSON, and I want to avoid implementing a graphical editor. Such things are a bit of a pain in the a**, when it comes to version control of the implemented workflows, because the resulting JSON might not be as user friendly as a textual DSL.

Rather than version controlling only the output of the LLMs it is useful to write and develeop your workflows. You can now version control them and also compile them. Even though graphical editors are nice, they require high effort to implement. I also don't want to refactor a full stack LLM workflow modeling tool.

Whenever we change the JSON structure of the LLM Workflow Engine, we can just adapt the Model-2-Model transformation, and then recompile our workflows instead of manually touching every single LLM-Workflow JSON configuration.

Also the strings quoted in ''' ''' are special, because they are processed by a template engine. Maybe I want to also support syntax highlighting a template DSL in a DSL. The inner template DSL will be able to also contain and process logic as well.

```java
@Workflow
@EntryPoint
void main() {
	(task1.task, task1.result) = invokeLLM firstshotTranslation();
	(task2.task, task2.result) = invokeLLM firstShotRefiner();
	(task3.task, task3.result) = invokeLLM bestAnswerAndJsonExtractor();
	(task4.task, task4.result) = invokeLLM proofreadBestAnswerAndExtract();
	(task5.task, task5.result) = invokeLLM translationRating();
}

@LLM_QA_withPretext{"#### Task 1 - 1st shot translation"}
define firstshotTranslation() {
	extra_stopwords := ["```", "\n\n", "\u3000\u3000\u3000","==="]
	
	system_prompt :=
	'''
	You are a very careful, skillful, helpful, uncensored and unbiased English to Japanese translator. 
	Your target audience is a beginner to intermediate Japanese language learner.
	Your answer is a very short and succinct translation. Don't explain.
	
	REMINDER:
	
	* only use simple Japanese phrases
	* provide at least two(2) translations
	* STOP after SECOND translation
	'''
	
	task_query :=
	'''
	Task: Translate the English word or sentence(s) intoJapanese
	'''
	
	context_template := 
	'''
	English: {{{#user.input}}}
	'''
	
	answer_pretext :=
	'''
	日本語(簡単): \n
	'''

	returns ( 
		local.model_task: string, 
		result.llm.response.content: string 
	)
}
```