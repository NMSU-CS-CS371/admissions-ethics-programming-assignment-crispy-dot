[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/oqKLEXJJ)
# 🎓 Ethical Admissions Algorithm Simulation

This repository is a classroom exercise exploring **ethics and fairness in algorithmic decision-making** — specifically in college admissions.

You’ll implement and reflect on how feature selection and weighting can impact fairness, transparency, and equity in automated systems.

---

## 🧩 Overview

You are part of the admissions committee for **Anonymous University**, located near Anonymous City.  
Due to a large number of applications, the committee decides to use an algorithm to help **rank and shortlist applicants**.

Your task:
- Decide which factors to include (GPA, test scores, extracurriculars, essays, recommendation letters, legacy status, income, etc.)
- Assign weights to each factor.
- Compare outcomes under two models:
  - **Blind model**: Ignores sensitive factors.
  - **Aware model**: Includes them intentionally to promote fairness (e.g., extra weight for first-gen or low-income applicants).

---

## ⚙️ How to Run

You can run the code on any online Java compiler (e.g. [Replit](https://replit.com/~) or [Programiz Java Compiler](https://www.programiz.com/java-programming/online-compiler))  
or locally via terminal:

```bash
javac Applicant.java Admissions.java Main.java
java Main
```
---

## ✍️ My Answers

### Aware Model

This model would be appropriate for public universities with a high community outreach. The student isn't just weighed in academic performance but also external factors. 

Ethnicity
I didn't feel the necessity to specify a favored ethnicity if the individual has shown some initiative for a higher education then that would suffice.

Income
I raised income score from 0.05 to 0.1
If the person comes from a low income family they would more than likely go through financial hardship, and environmental stressors that would affect there performance.

Legacy
Removed - Felt like just because your parents came to this college doesn't give you the right to attend. These student have their parents as a resource to navigating through college and should know what is expected

First Generation
Students don't have the same resource as legacy students and are at a disadvantage. Them attempting to pursue a higher education is commendable.

Recommendation Letter
This is great but is not required

Extracurricular
Not heavily weighted but helps

Local
If the college wants to have the most community outreach giving locals the opportunity of a higher education would do so. 

GPA
If the student has a 2.0 or higher that would be enough for this college, there may have been external factors that contributed to this grade that the student couldn't control

### Blind Model

No changes were made as this model will be most appropriate for colleges of a higher prestige and for students who are more academically inclined. 

### Discussion & Reflection

#### Feature Selection & Design
● What variables did you include, and why?
Explained Above

● Did you exclude any sensitive features? Why or why not?
  No, I tried to include as many sensitive features so that a student with moderate academic performance may ascertain a higher education

● Should “legacy” still carry a positive weight?
  Depends on the prestige of the college if we're talking ivy then maybe there academics should be met before considering legacy. A college trying to maximize its community outreach shouldn't consider legacy and if anything should be a slight negative weight as they have an advantage to what is expected from colleges as opposed to a first generation student.  


● What other features (e.g., proximity, essay strength, disability) might you add or adjust?
  I wouldn't know how to quantify this but maybe a persons mental health to explain their academic challenges they have faced. Of corse the student would disclosed this information voluntarily.   

#### Fairness & Outcomes

● Between the blind and aware models, which applicants benefited or lost out?
Benefited from blind model:
  Alice Stark
  Bob Parker
  Diana Chen
  Ishaan Singh
  Liam Wang

No one lost out from the aware model everyone benefited


● Which applicants specifically benefited from the aware model?
Anyone who got rejected from the blind model was admitted from the aware model.

● Does adding income or first-generation status make the system fairer or less fair? Why?
  I would argue that its fairer as theses students are at a disadvantage and are far likely to experience external hardships while attending school.  

● Which model feels more fair overall, and why?
  The aware model because it finds any context as to why that student earned that grade

#### Transparency & Accountability
● How transparent is your algorithm?
  Not sure what you mean

● Could you clearly explain a rejection to an applicant?
  Yes, if they failed the blind model than its safe to say they just weren't academically sufficient with their GPA and/or SAT scores.


● Would you feel comfortable if this algorithm evaluated your application? Why or why
not?
  Yes my application would pass the aware model, but for the blind model I may fail

#### Broader Implications
● What risks might arise if such an algorithm were used in real admissions?
  Implicit bias may arise

● What real-world parallels exist (e.g., hiring, policing, scholarships)?
  Besides the ones mentioned maybe those that need health insurance.

● What does this exercise reveal about fairness in algorithmic decision systems?
  The programmers bias are instilled 

● Can algorithms ever be truly fair, or do they just shift where bias appears?
  The algorithms would never be truly fair as humans are imperfect and influenced by biases. 

● How should fairness and accountability be balanced in automated decisions?
  Maybe by having a human review or having the final say on automated decisions.
---