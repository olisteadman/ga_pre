import React, { Component } from 'react';
import { AppRegistry, View, Image, StyleSheet, Text, Button, TouchableOpacity, TextInput } from 'react-native';

export default class DisplayAnImage extends Component {
  
  constructor(props) {
    super(props);
    this.email = { text: 'name@domain.ext' };
    this.pswrd = { text: 'name@domain.ext' };
  }
  
  render() {
    return (
      
      <View style={styles.container}>
        
        <View style={styles.containertop}>
        <Image style={styles.image} source={require('assets/images/872zcnwY_400x400.jpg')}/>
        </View>
        
        <View style={styles.container}>
        <Text style={styles.titleText}>
        Sign in
        </Text>
        </View>
        
        <View style={styles.container}>
        
        <Text style={styles.baseText}>
        Email
        </Text>
        </View>
        
        <View style={styles.container}>
        
        <TextInput
        style={{height: 40, borderColor: 'gray', borderWidth: 1}}
        onChangeText={(text) => this.setState({text})}
        value={this.email.text}/>
        </View>
        
        <View style={styles.container}>
        
        <Text style={styles.baseText}>
        Password
        </Text>
        </View>
        
        <View style={styles.container}>
        
        <TextInput
        style={{height: 40, borderColor: 'gray', borderWidth: 1}}
        onChangeText={(text) => this.setState({text})}
        value={this.pswrd.text}/>
        </View>
        
        <View style={styles.container}>
        <TouchableOpacity style={styles.button} onPress={this.onPress}>
        <Text style={styles.buttontxt}>
        Sign in
        </Text>
        </TouchableOpacity>
        
        <Text style={styles.purpText}>
        Forgot password
        </Text>
        </View>
        
        <View style={styles.containerbtm}>
        <Text style={styles.baseText}>
        © OnCare.
        </Text>
        <Text style={styles.purpText}>
        Terms and conditions
        </Text>
        </View>
        
      </View>
    );
  }
}

// skip this line if using Create React Native App
AppRegistry.registerComponent('DisplayAnImage', () => DisplayAnImage);

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  containertop: {
    // flex: .7,
    backgroundColor: '#FF821E',
    alignItems: 'center',
  },
  containerbtm: {
    flex: 1,
    justifyContent: 'space-between'
  },
  image: {
    height: 100,
    width: 100,
  },
  button: {
    alignItems: 'center',
    padding: 10,
    marginTop:10,
    paddingTop:15,
    paddingBottom:15,
    marginLeft:30,
    marginRight:30,
    backgroundColor:'#c4a4c4',
    borderRadius:10,
    borderWidth: 1,
    borderColor: '#fff',
  },
  buttontxt: {
    fontWeight: 'bold',
    fontFamily: 'Verdana',
    color: '#fff'
  },
  baseText: {
    fontWeight: 'bold',
    fontFamily: 'Verdana',
    paddingTop:5,
    paddingBottom:5,
  },
  purpText: {
    fontWeight: 'bold',
    fontFamily: 'Verdana',
    color: '#c4a4c4',
    paddingTop:5,
    paddingBottom:5,
  },
  titleText: {
    fontSize: 20,
    fontWeight: 'bold',
    fontFamily: 'Verdana', // to add custom font see https://medium.com/react-native-training/react-native-custom-fonts-ccc9aacf9e5e
    paddingTop:5,
    paddingBottom:5,
  },
});