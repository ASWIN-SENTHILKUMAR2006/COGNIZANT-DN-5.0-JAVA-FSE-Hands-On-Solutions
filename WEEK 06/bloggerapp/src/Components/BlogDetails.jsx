import React from 'react';

function BlogDetails(props) {
  return (
    <div style={{ flex: 1, padding: '0 20px', textAlign: 'left' }}>
      <h2>Blog Details</h2>
      {props.blogs.map((blog) => (
        <div key={blog.id} style={{ marginBottom: '20px' }}>
          <h3>{blog.title}</h3>
          <p><strong>{blog.author}</strong></p>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;