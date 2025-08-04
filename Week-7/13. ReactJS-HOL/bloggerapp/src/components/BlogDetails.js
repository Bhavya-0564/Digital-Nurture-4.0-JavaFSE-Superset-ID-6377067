// src/components/BlogDetails.js
import React from 'react';

function BlogDetails({ show }) {
  if (!show) return null;

  return (
    <div className="v1">
      <h2>Blog Details</h2>
      <p><strong>React Learning</strong> - Welcome to learning React!</p>
      <p><strong>Installation</strong> - You can install React from npm.</p>
    </div>
  );
}

export default BlogDetails;
