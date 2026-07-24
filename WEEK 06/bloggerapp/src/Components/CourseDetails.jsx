import React from 'react';

function CourseDetails(props) {
  return (
    <div style={{ flex: 1, padding: '0 20px', borderRight: '5px solid green', textAlign: 'center' }}>
      <h2>Course Details</h2>
      {props.courses.map((course, index) => (
        <div key={index} style={{ marginBottom: '20px' }}>
          <h3>{course.cname}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;