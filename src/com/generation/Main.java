package com.generation;

public class Main
{
    public static void main( String[] args )
    {
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";
        courseService.displayCourseInformation( courseId );
        courseService.displayStudentInformation( studentId);
        //inscribe al student al curso, da la info del student
        courseService.enrollStudent( studentId, courseId );
        courseService.enrollStudent(studentId, "art_01");
        courseService.displayStudentInformation( studentId);
        //desinscribe al estudiante; despupes da la info
        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
        
    }

}