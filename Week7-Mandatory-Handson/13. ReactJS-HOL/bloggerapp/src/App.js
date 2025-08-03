
import { useState } from "react";
import React from "react";
import CourseDetails from "./components/CourseDetails";
import BlogDetails from "./components/BlogDetails";
import BookDetails from "./components/BookDetails";
import "./App.css";
function App() {
  const [showCourses, setShowCourses] = useState(true);
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);

  return (
    <div className="container">
      {showCourses && <CourseDetails />}
      {showBooks ? <BookDetails /> : null}
      {showBlogs ? <BlogDetails /> : <p>No blog to show</p>}
    </div>
  );
}

export default App;