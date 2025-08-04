// src/App.js
import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [showBlog, setShowBlog] = useState(true);
  const [isReactCourse, setIsReactCourse] = useState(true);

  return (
    <div style={{ textAlign: "center", marginTop: "30px" }}>
      <BookDetails />

      <button onClick={() => setShowBlog(!showBlog)}>
        Toggle Blog Details
      </button>
      <BlogDetails show={showBlog} />

      <button onClick={() => setIsReactCourse(!isReactCourse)}>
        Toggle Course
      </button>
      <CourseDetails isReact={isReactCourse} />
    </div>
  );
}

export default App;
