import React from 'react';
import CourseDetails from './Components/CourseDetails';
import BookDetails from './Components/BookDetails';
import BlogDetails from './Components/BlogDetails';

function App() {
  const courses = [
    { cname: 'Angular', date: '4/5/2021' },
    { cname: 'React', date: '6/3/2021' }
  ];

  const books = [
    { id: 1, bname: 'Master React', price: 670 },
    { id: 2, bname: 'Deep Dive into Angular 11', price: 800 },
    { id: 3, bname: 'Mongo Essentials', price: 450 }
  ];

  const blogs = [
    { id: 101, title: 'React Learning', author: 'Stephen Biz', content: 'Welcome to learning React!' },
    { id: 102, title: 'Installation', author: 'Schewzdenier', content: 'You can install React from npm.' }
  ];

  return (
    <div style={{ display: 'flex', marginTop: '40px', fontFamily: 'Arial, sans-serif' }}>
      <CourseDetails courses={courses} />
      <BookDetails books={books} />
      <BlogDetails blogs={blogs} />
    </div>
  );
}

export default App;