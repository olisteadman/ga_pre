import React from 'react';
import { StyleSheet, Animated, Text, View, Dimensions, Button } from 'react-native';
import { Video } from 'expo';
import { MaterialIcons, Octicons } from '@expo/vector-icons';
import { StackNavigator } from 'react-navigation';

class HomeScreen extends React.Component {
  static navigationOptions = {
    title: 'Home',
  };
  render () {
    const { navigate } = this.props.navigation;
    return (<Button title="Go to Gina's Profile" onPress={() => navigate('Profile')} />);
  }
}

class ProfileScreen extends React.Component {
  static navigationOptions = {
    title: 'Profile',
  };
  render () {
    const { navigate } = this.props.navigation;
    return (<Button title="Go to Gina's Homepage" onPress={() => navigate('Home')} />);
  }
}

const App = StackNavigator({
  Home: { screen: HomeScreen },
  Profile: { screen: ProfileScreen },
});

export default App;

// export default class App extends React.Component {
//   state = {
//     mute: false,
//     fullScreen: false,
//     shouldPlay: true,
//   }

//   handlePlayAndPause = () => {
//     this.setState(prevState => ({
//       shouldPlay: !prevState.shouldPlay
//     }));
//   }

//   handleVolume = () => {
//     this.setState(prevState => ({
//       mute: !prevState.mute,
//     }));
//   }

// //   componentDidMout() {console.log("MOUNTED!")}

// //   render() {
// //     const { width } = Dimensions.get('window');
    
// //     return (
// //       <View style={styles.container}>
// //         <View>
// //             <Text style={{ textAlign: 'center' }}> React Native Video </Text>
// //             <Video
// //               source={{ uri: 'http://d23dyxeqlo5psv.cloudfront.net/big_buck_bunny.mp4' }}
// //               shouldPlay={this.state.shouldPlay}
// //               resizeMode="cover"
// //               style={{ width, height: 300 }}
// //               isMuted={this.state.mute}
// //             />
// //             <View style={styles.controlBar}>
// //               <MaterialIcons 
// //                 name={this.state.mute ? "volume-mute" : "volume-up"}
// //                 size={45} 
// //                 color="white" 
// //                 onPress={this.handleVolume} 
// //               />
// //               <MaterialIcons 
// //                 name={this.state.shouldPlay ? "pause" : "play-arrow"} 
// //                 size={45} 
// //                 color="white" 
// //                 onPress={this.handlePlayAndPause} 
// //               />
// //             </View>
// //           </View>
// //       </View>
// //     );
// //   }
// }

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  controlBar: {
    position: 'absolute',
    bottom: 0,
    left: 0,
    right: 0,
    height: 45,
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: "rgba(0, 0, 0, 0.5)",
  }
});