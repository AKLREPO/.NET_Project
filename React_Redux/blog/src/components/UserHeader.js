import React from "react";
import {connect} from "react-redux";
import {fetchUser} from "../actions";

class UserHeader extends React.Component{


    
    renderList(){
        const {user} = this.props;
        
        if(!user) {
            return null;
        }

        return (
            <div className="header">{user.name}</div>

        )
    
    }

    render(){

        
        return (
            <div class="ui relaxed divided list">
                {this.renderList()}
            </div>
        );
    }
}

//map the state.users from reducer in store to props in this component
const mapStateToProps = (state, ownProps) =>{
    return {user: state.users.find(user => user.id === ownProps.user_id)};
}

export default connect(mapStateToProps)(UserHeader);