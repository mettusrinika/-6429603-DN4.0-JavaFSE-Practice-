import BlogDetails from './BlogDetails';

function App() {
  const blogs = ["React Basics", "Using Hooks", "Conditional Rendering"];

  return (
    <div>
      <h1>Blogger App</h1>
      <BlogDetails blogs={blogs} />
    </div>
  );
}

export default App;
