import React from 'react';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        this.setState({ posts: data });
      })
      .catch(error => {
        console.error("Error fetching posts:", error);
        alert("Error fetching posts: " + error.message);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    console.error("Error caught in component:", error, info);
    this.setState({ hasError: true });
    alert("Something went wrong in the Posts component.");
  }

  render() {
    if (this.state.hasError) {
      return <h3 style={{ color: 'red' }}>Something went wrong while loading posts.</h3>;
    }

    return (
      <div>
        <h2>Post List</h2>
        {this.state.posts.length === 0 ? (
          <p>Loading posts...</p>
        ) : (
          <ul>
            {this.state.posts.map(post => (
              <li key={post.id}>
                <h4>{post.title}</h4>
                <p>{post.body}</p>
              </li>
            ))}
          </ul>
        )}
      </div>
    );
  }
}

export default Posts;
