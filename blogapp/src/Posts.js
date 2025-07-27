import React from 'react';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [
        {
          id: 1,
          title: "5 Simple Tips to Stay Productive",
          body: "Avoid multitasking, take regular breaks, and keep your to-do list short. Focus on one task at a time to improve efficiency."
        },
        {
          id: 2,
          title: "Mastering React as a Beginner",
          body: "Start with components, props, and state. Once you're comfortable, move to hooks and state management with Redux or Context API."
        },
        {
          id: 3,
          title: "Why Time Management Matters",
          body: "Managing your time effectively helps reduce stress and improve work-life balance. Use planners or digital tools to organize your day."
        },
        {
          id: 4,
          title: "Healthy Habits for Developers",
          body: "Practice good posture, take screen breaks, and stay hydrated. Regular stretching and walking can prevent fatigue and boost creativity."
        },
        {
          id: 5,
          title: "Getting Started with Git and GitHub",
          body: "Version control is essential. Learn how to clone, commit, push, and pull repositories. Use GitHub to collaborate with others."
        }
      ]
    };
  }

  render() {
    const { posts } = this.state;

    return (
      <div>
        <h2>Blog Posts</h2>
        {posts.map(post => (
          <div key={post.id} style={{ marginBottom: "20px" }}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
