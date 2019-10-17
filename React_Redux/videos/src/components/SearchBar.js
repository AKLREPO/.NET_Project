import React from 'react';

class SearchBar extends React.Component{    

    state = { term: "" };

    onInputChangeCallBack = (event) => {
        this.setState({term: event.target.value});
    }

    onFormSubmitCallBack = (event) => {
        event.preventDefault();
        //TODO: Make sure we call callback from parent component
        this.props.onFormSubmit(this.state.term);
    }

    render(){
    
        return (
            <div className="search-bar ui segment">
                <form onSubmit={this.onFormSubmitCallBack} className="ui form">
                    <div className="field">
                        <label>Video Search</label>
                        <input 
                            type="text" 
                            onChange={this.onInputChangeCallBack}
                            value={this.state.term} 
                        />
                    </div>
                </form>
            </div>
        );//return 
        
        
    }
}

export default SearchBar;