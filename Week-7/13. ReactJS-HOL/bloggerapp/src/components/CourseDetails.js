// src/components/CourseDetails.js
import React from 'react';

function CourseDetails({ isReact }) {
  const course = isReact
    ? { name: 'React', date: '6/12/2024' }
    : { name: 'Angular', date: '4/5/2024' };

  return (
    <div className="mystyle1">
      <h2>Course Details</h2>
      <p>{course.name}</p>
      <p>{course.date}</p>
    </div>
  );
}

export default CourseDetails;
