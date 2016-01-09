'use strict';

var React = require('react-native');
var { requireNativeComponent, PropTypes, View } = React;

var NativeCamera = requireNativeComponent('ReactNativeCamera', Camera);

var CAMERA_REF = 'camera';

class Camera extends React.Component {
  render() {
    return <NativeCamera ref={CAMERA_REF} {...this.props} />;
  }
}

Camera.propTypes = {
  myCustomProperty: React.PropTypes.oneOf(['a', 'b']),
};


module.exports = Camera;