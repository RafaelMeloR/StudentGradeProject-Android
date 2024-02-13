# StudentGradeProject-Android

Create an Android Project named StudentGradeProject to add more widgets to layout 
resource defining UI activity. Add two TextView widgets, two Button widgets placed 
within horizontal LinearLayout to allow mobile user to read student grade information 
stored into collection of array objects and displaying each element within TextView widget 
as shown hereafter in Figure.
b) Create Grade class which represents Model class of MVC pattern and defines data attributes 
of every student grade record with the following fields: student_id (int), student_lname 
(string), student_fname (string), s_grade_Assignment1 (int), s_grade_Assignment2(int), 
s_grade_Assignment3(int), s_grade_Mid_Term (int), s_grade_Final_Term (int).
• Add default constructor (student_id=0, student_fname="", student_lname="", 
s_grade_Assignment1=0, s_grade_Assignment2=0, s_grade_Assignment3=0, 
s_grade_Mid_Term=0, s_grade_Final_Term=0) and constructor with parameters.
• Add public Mutator (setter) and Accessor (getter) methods in Grade class
• Add a method within Grade class called (Calculate_GradeAverage ()) that calculates and 
returns the average score for each student according to the following mark distribution: 
1) 40 % for all assignments (s_grade_Ass1 for Assignment 1), (s_grade_Ass2 for
Assignment 2), (s_grade_Ass3 for Assignment 3) 
2) 30 % for Mid Term Exam (s_grade_Mt)
3) 30 % for Final Exam (s_grade_Ft)
c) Override methods onStart(), onResume(), onPause(), onStop(), and 
onDestroy(). Press Home button and rotate mobile device to see these methods being 
invoked by Android OS in Log viewer tool of Android Studio.
420-952-VA App.Dev.2 (Mobile) 3/5 CEGEP VANIER COLLEGE 2024
d) Add button “Next Student” to skip through each next element of Grade array of 
objects and displays student info within TextView widget as shown hereafter in Figure.
Populate array elements to be set to the following record values:
(1,"Graham","Bill",69,70,98,80,90 )(2,"Sanchez","Jim",88,72,90,83,93 )
(3,"White","Peter",85,80,45,93,70 )(4,"Phelp","David",70,60,60,90,70 )
(5,"Lewis","Sheila",50,76,87,59,72)(6,"James","Thomas",89,99,97,98,99)
e) Add button “Prev Student” to skip through each previous element of Grade array of 
objects and displays student info within TextView widget as shown hereafter in Figure.
f) Add button “Display Student Grade Average” to display student grade average of 
each array element into TextView widget and within device screen layout using Toast
class as shown hereafter in Figure.
g) Add new layout to StudentGradeProject so mobile user will get that layout when she rotates 
her mobile device as shown in Figure above. Use FrameLayout and place the three buttons 
within Vertical LinearLayout.
h) Notice that when you rotate mobile device, the activity is destroyed and created again to 
match mobile screen configuration. The mobile user will get first element of array at index
0 displayed in landscape orientation despite displaying array element at index 2 when using 
portrait orientation. 
i) Use Bundle class object to save currentIndex of array object so that the current student 
grade object will be displayed whatever mobile user chooses as orientation. Override the 
method onSaveInstanceState(Bundle savaInstanceState)accordingly
