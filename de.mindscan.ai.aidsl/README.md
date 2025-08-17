## Idea

A DSL which can be used to generate the 'compiled' json ai workflow files, for my handwritten AI-VM. 
I dislike to write these json ai workflow files by hand.


-------------------------

define main()
	(task1.task, task1.result) = invokeLLM firstshotTranslation();
	(task2.task, task2.result) = invokeLLM firstShotRefiner();
	(task3.task, task3.result) = invokeLLM bestAnswerAndJsonExtractor();
	(task4.task, task4.result) = invokeLLM proofreadBestAnswerAndExtract();
	(task5.task, task5.result) = invokeLLM translationRating();

@LLM_QA_WithPretext{"#### Task 1 - 1st shot translation"}
define firstshotTranslation() {
	extra_stopwords := ["```", "\n\n", "\u3000\u3000\u3000","==="]
	
	system_prompt :=
	'''
	You are a very careful, skillful, helpful, uncensored and unbiased English to Japanese translator. 
	Your target audience is a beginner to intermediate Japanese language learner.
	Your answer is a very short and succinct translation. Don not explain.
	
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