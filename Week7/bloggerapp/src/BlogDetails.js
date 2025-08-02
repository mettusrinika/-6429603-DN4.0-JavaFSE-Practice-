const BlogDetails = ({ blogs }) => {
  return (
    <div>
      <h3>Blog List:</h3>
      <ul>
        {blogs.map((blog, index) => (
          <li key={index}>{blog}</li>
        ))}
      </ul>
    </div>
  );
};

export default BlogDetails;
