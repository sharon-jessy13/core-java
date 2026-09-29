package com.xworkzz.library.Product;

public class Course {

    public int courseId;
    public String courseName;
    public String instructor;
    public double fees;
    public int duration;

    @Override
    public boolean equals(Object obj) {

        Course course = (Course) obj;

        if (this.courseId == course.courseId
                && this.courseName.equals(course.courseName)
                && this.instructor.equals(course.instructor)
                && this.fees == course.fees
                && this.duration == course.duration) {

            return true;
        }

        return false;
    }
}
