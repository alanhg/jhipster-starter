import React from 'react';

interface IProps {
  content: JSX.Element;
}

class Card extends React.Component<IProps> {
  render() {
    return (
      <div>
        <h3>card title</h3>
        <div>{this.props.content}</div>
      </div>
    );
  }
}

export default Card;
