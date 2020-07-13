import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  render() {
    const title = 'This is Oliver\'s app';
    const anotherTitle = 'Another title';

    return (
      <div className="App">
        <h1>
        {true ? anotherTitle : title}
        </h1>
      </div>
    );
  }
}

export default App;
