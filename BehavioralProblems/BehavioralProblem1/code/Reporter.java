class Reporter {
	public static void main(String[] args) {
		Submission[] submissions = new Submission[5];
		TimeoutReport[] toReps = new TimeoutReport[5];
		PassedReport[] pReps = new PassedReport[5];

		for(short i = 0; i < 5; i++) { submissions[i] = new Submission(); }
		for(short j = 0; j < 5; j++) {
			toReps[j] = new TimeoutReport(submissions[j]);
			pReps[j] = new PassedReport(submissions[j]);
		}
		for(short k = 0; k < 5; k++) {
			submissions[k].runTestCase();
			toReps[k].report();
			pReps[k].report();
		}
	}
}