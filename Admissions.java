// Admissions.java
// Contains the scoring models (Blind vs Aware).

public class Admissions {

    // Blind model (only academic/performance factors)
    public static double blindScore(Applicant app) {
        double score = 0.0;
        score += (app.gpa / 4.0) * 0.4;     // GPA normalized
        score += (app.test / 1600.0) * 0.3;  // Test score normalized
        score += app.extra * 0.1;
        score += app.essay * 0.1;
        score += app.rec * 0.1;
        return score; // final score between 0 and 1
    }

    // Aware model (adds equity and context)
    public static double awareScore(Applicant app) {
        double score = blindScore(app);

        if (app.income < 40000) score += 0.1;     // low-income boost
        if (app.firstGen) score += 0.1;           // first-generation bonus
        if (app.disability) score += 0.1;         // accessibility consideration 
        if (app.local) score += 0.1;              // local preference
        if (app.gpa > 2.0) score += 0.2;          // gpa
        if (app.extra >= 0.7) score += 0.5;       // extracurriculars
        if (app.essay >= 0.7) score += 0.5;       // essay quality
        if (app.rec >= 0.7) score += 0.5;         // recommendation strength
        if (app.test < 950) score -= 0.1;         // low test score penalty

        return Math.min(score, 1.0);               // cap score at 1.0
    }
}