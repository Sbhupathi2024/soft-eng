package edu.okcu.softeng;

public class Grade {
    private String letterGrade;
    private int grade;
    
    public Grade(int i) {
		
	}

	public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
        setLetterGrade();
    }

    public String getLetterGrade() {
        return this.letterGrade;
    }

    /***
     * A+ (96 - 100) A (95) A- (90 - 94)
     * B+ (86 - 89)  B (85) B- (80 - 84)
     * C+ (76 - 79)  C (75) C- (70 - 74)
     * D+ (66 - 69)  D (65) D- (60 - 64)
     * F less than 60
     */
    private void setLetterGrade() {
        if (grade > 90)
            this.letterGrade = "A";
        else if (grade >= 80)
            this.letterGrade = "B";
        else if (grade >= 70)
            this.letterGrade = "C";
        else if (grade < 60)
            this.letterGrade = "D";
        else
            this.letterGrade = "F";

        var digit = grade % 10;
        if (digit >= 0 && digit <= 4)
            this.letterGrade += "-";
        else if (digit >= 6 && digit <= 9)
            this.letterGrade += "+";
    }
}
