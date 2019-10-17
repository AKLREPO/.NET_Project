import React from "react";
import {connect} from "react-redux";

class UserHeader extends React.Component{

    render(){
        //const user = this.props.user.find((user) => user.id === this.props.userId);
        const {user} = this.props;

        if(!user){
            return null;
        }
        
        return(
            <div className="header">
                {user.name}
            </div>
        );

    }
}

const mapStateToProp = (state, ownProps) => {
    return {
        user: state.user.find((user) => user.id === ownProps.userId)
    };
};

/*
const mapDispatchToProp = {
    fetchPostsAndUsers: fetchPostsAndUsers
};
*/

export default connect(mapStateToProp)(UserHeader);