import React, {
  Component
} from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';
class HelloWorld extends Component {
  render() {
    return (
      <View style = {styles.container} >
      <Text style = {styles.hello} > Hello, World < /Text >
      <Text style = {
        styles.hello
      } > This is my first RN fixed Android Project < /Text >
      </View >
    )
  }
}
var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
  },
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
});
AppRegistry.registerComponent('HelloWorld', () => HelloWorld);
