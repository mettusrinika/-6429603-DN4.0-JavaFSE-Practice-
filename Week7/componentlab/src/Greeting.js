import React, { Component } from 'react';

class Greeting extends Component {
  render() {
    return <h3>Good {this.props.timeOfDay}, {this.props.name}</h3>;
  }
}

export default Greeting;
