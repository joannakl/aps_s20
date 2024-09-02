---
layout: default
---


# Textbook(s)

---

<!--
|<img src="{{site.book_required_image}}" name="Book" border="0px" width="120px">| **[{{ site.book_required }}]( {{ site.book_required_link }})** {{ site.book_required_edition }}<br> {{ site.book_required_author }} <br> {{ site.book_required_note }}  |
-->

|<img src="{{site.book_opt_1_image}}" name="Book" border="0px" width="120px">| **[{{ site.book_opt_1 }}]( {{ site.book_opt_1_link }})** {{ site.book_opt_1_edition }}<br> {{ site.book_opt_1_author }} <br> {{ site.book_opt_1_note }}  |
|<img src="{{site.book_opt_2_image}}" name="Book" border="0px" width="120px">| **[{{ site.book_opt_2 }}]( {{ site.book_opt_2_link }})** {{ site.book_opt_2_edition }}<br> {{ site.book_opt_2_author }} <br> {{ site.book_opt_2_note }}  |
|<img src="{{site.book_opt_3_image}}" name="Book" border="0px" width="120px">| **[{{ site.book_opt_3 }}]( {{ site.book_opt_3_link }})** {{ site.book_opt_3_edition }}<br> {{ site.book_opt_3_author }} <br> {{ site.book_opt_3_note }}  |
|<img src="{{site.book_opt_4_image}}" name="Book" border="0px" width="120px">| **[{{ site.book_opt_4 }}]( {{ site.book_opt_4_link }})** {{ site.book_opt_4_edition }}<br> {{ site.book_opt_4_author }} <br> {{ site.book_opt_4_note }}  |
|<img src="{{site.book_opt_5_image}}" name="Book" border="0px" width="120px">| **[{{ site.book_opt_5 }}]( {{ site.book_opt_5_link }})** {{ site.book_opt_5_edition }}<br> {{ site.book_opt_5_author }} <br> {{ site.book_opt_5_note }}  |


# Useful Resources
---

- [Java API 11 documentation](https://docs.oracle.com/en/java/javase/11/docs/api/index.html)
- [CPP Reference](https://en.cppreference.com/w/)
- [CPlusPlus](http://www.cplusplus.com/reference/)
- [Source code examples for the CP3 book](https://sites.google.com/site/stevenhalim/home/material) - collection of
zip files for the third edition of the book
- [GitHub Repository with the code for the book](https://github.com/stevenhalim/cpbook-code),
updated for the next edition of the book




# Prerequisites
---

- __Passing CSCI.UA.0201 with a grade of C or better.__
- __Passing CSCI.UA.0310 with a grade of C or better.__
- Strong familiarity with either Java or C++ or both. (__You will not be able to program in Python.__)
- (You are expected to also know and remember the material from CSCI.UA.0101 and CSCI.UA.0102 courses.)




# Topics Covered (exact list of topics will depend on how quickly or slowly we will go through the material)
---

- programming basics: I/O, variable types and ranges
- time/space complexity analysis: estimate the execution time of a program
- fundamental data structures: array, linked list, stack, queue, binary search tree, hash table, heap/priority queue,
- tree data structures: union-find, trie
- problem solving strategies: complete search, greedy, binary/ternary search, divide-and-conquer
- decomposition and range queries: square-root/binary decomposition, segment tree, Fenwick tree, sparse table,
- graph algorithms: shortest path, topological sort, minimum spanning tree, Eulerian path/cycle, strongly connected components, articulation points & bridges
- dynamic programming (DP): subset sum, weight balancing, knapsack, longest common subsequence (LCS), edit distance, longest increasing subsequence (LIS), Hamiltonian path/cycle, DP state design and transition formulation
- string matching: Rabin-Karp, polynomial string hashing, KMP
- mathematics: prime, sieve of Eratosthenes, combinatorics, probability and expected value

# Grading
---

Your course grade will be based on:

- exams, 35% (one midterm: 15%, and one final exam: 20)
- weekly homeworks 40%, each homework will consist of two parts 
	- 20% problem set with 5 problems each week (see [Gradescope verdicts](problem_grading.html) for how the scores are computed) 
	- 20% recorded 5 minute problem presentation 
- online Codeforces contest participation, 5%
- group project on an assigned topic and 20 minute in-class presentation on that topic, 20% 
- unannounced in-class activities (add up to 3 points each to the next exam score).   

The letter grades will be determined using the following scale:

        A   95-100
        A-  90-95
        B+  87-90
        B   83-87
        B-  80-83
        C+  76-80
        C   72-76
        D   65-72
        F   less than 65


The grade of *Incomplete* is reserved for students who, for legitimate and documented reason, miss the final exam. The grade of *Incomplete* **will not be given** to student who started falling behind in class. 
Those students should withdraw from the class or switch to *Pass/Fail* option.


## Exams
---
There will be a midterm and a final exam. All exams are cumulative, timed and synchronous. The exams are paper-based. You are expected to write algorithms and apply given algorithms (no coding).

__Missing an exam:__ If you miss the midterm exam, the final exam score will count for both exams. If you miss the final exam, you will receive a grade of 
incomplete in the course and you will need to take the final exam during the first week of the spring semester. 


## Homework / Weekly Problem Sets
---

Each week you will have a problem set to solve (several problems of varying difficulty).  You should expect 12 problem sets with 5 problems each. (These numbers may be adjusted if there are significant
changes to the course scheduling.)
Fifty highest scoring problems will count towards your course grade. There will be no late submissions on problem sets for any reason (this is why we will be dropping ten lowest scores). 
We will try to avoid having due dates that conflict with major holidays, but it is not always possible.  

After the due date for each problem set, we will announce one problem (and one alternative problem) from the problem set for which you need to record a 5 minute long explanation of your solution. 
If you submitted a solution to the announced problem, then you have to explain that problem. If you did not, but submitted a solution to the alternative problem, then you need to 
explain your solution to that problem. Finally, if you were not able to submit solutions to either of the posted problems, you can submit an explanation of any problem that you submitted. 
You do not need to pass all (or even any) of the autograder tests in order to explain your solutions. These will be graded on clarity of the explanation and consistency of the explanation with the submitted code, 
not the correctness of your solution. 

## Online Contests
---

You need to participate in one or more of the regular contests hosted on [Codeforces](https://codeforces.com). 
You need to submit passing solutions to five different problems (in a single contest or in multiple ones). Your solutions need to be submited while the contest is active, not after the contests concludes. 
Think of this as practice of your skills in the real world.

The CodeForces contests fall under different divisions (division 1 contains the most challenging problems, division 2 has somewhat simpler problems, and so on). Problems that you solve in 
divison 1 and all but problem A in division 2 contests earn you full credit. Problem A in division 2 and all problems in division 3 and 4 contests earn you 75% credit. 

Check the [calendar of contests on Codeforces site](https://codeforces.com/calendar) for upcoming contests. There are contests added on a regular basis.  

## Group Project
---

Early on in the semester, you will be placed in a small student group. You will need to prepare material on a given topic (this will include a short tutorial presentation on the topic, and a collection of a few 
problems that other students in the class can attempt).  Each group will be allocated 20 minutes during one of the lectures to present their topic. 

# Academic Integrity Policy
---

This course follows the university and departmental policies on academic integrity:
- [Academic Integrity for Students at NYU](https://www.nyu.edu/about/policies-guidelines-compliance/policies-and-guidelines/academic-integrity-for-students-at-nyu.html)
- [CS Department Academic Integrity](http://cs.nyu.edu/webapps/content/academic/undergrad/academic_integrity)

Our main philosophy is that you need to be honest and fair to yourself, other students
in the class and the instructional stuff.

We know that interactions with your classmates can facilitate deeper understanding
of the subjects and provide invaluable lessons. But to benefit from those lessons
you need to be a participant in the team and not just a taker.

__All your work that is submitted for grading in this class has to be your own, unless
otherwise specified. You need to acknowledge any help that you receive on the assignments in your submissions.__

Here are examples of _fair_ and _not fair_ actions that a student may take. This is not an
exhaustive list and should serve as examples of behaviors rather than a complete
definition.

__Fair Actions__

- Working and solving a weekly problem set with other students AND writing the actual program
   on your own (you should acknowledge the names of all those involved in discussions)
- Discussing problem sets and assignments with the instructional stuff and
acknowledging such discussions in your submission.
- Incorporating a short fragment of code (a few lines) that you find in the course
suggested resources or other online resources and acknowledging it in your submission.
- Sharing code with others (possibly your classmates) that illustrates concepts
and techniques discussed in this course as long as this code is not a solution (or a partial solution)
to one of the assigned problems. (An example of such code would be routines that handle reading
from and writing to standard intput/output streams.)


__Not Fair Actions__

- Making your solutions available to others (publicly or privately). (This includes posting solution on a discussion forum, in a public repository, etc.).
- Asking a classmate to see their solutions prior to the last date at which submissions are
accepted (this may be different than the due date).
- Failing to acknowledge any form of help in the submission.
- Finding or generating solutions to problems online and using them for your own submissions.
- Asking anybody (other than the instructional stuff) for help during an exam.
- Looking at another student's work during an exam.


# Academic Email Etiquette
---

* Check the school email address on a regular basis. You can simply forward its content
to another email account that you use regularly.

* Use your school's email account to send emails to professors, instructors, TA's, graders,
administrators, etc. OR make sure that your email address contains your true name,
not "frabjous@gmail.com", "BabyGurl@yahoo.com" or some other cool alias.

* Start your email with proper salutations! Use the correct titles (Professor, Dr., etc.)
and spell first and last names correctly. If you are on the first name basis with your instructors,
use their names, not "Hey". For example: "Dear Professor Drummer" or "Dear Robert", not "Hey Bob".

* Sign your name under the body of your email, otherwise you expect people to read emails from anonymous.

* Do not write everything in upper-case letters. Do not write everything in lower-case letters.

* Make sure you included everything you wanted before hitting send. Don't send three emails
one after another because you forgot something in the first one.

* Proofread the text in your email before sending it. Most of the email clients check for
typos, but they cannot tell if your email makes much sense. Read it, before you send it.



<br>
<br>
