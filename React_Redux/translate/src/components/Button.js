import React from "react";
import LanguageContext from "../context/LanguageContext";
import ColorContext from "../context/ColorContext";

class Button extends React.Component{

    //static contextType = LanguageContext;

    renderSubmit(value){

    }

    render(){
        //const text = this.context === "english" ? "Submit" : "Voorleggen";
        return (
            <ColorContext.Consumer>
                {
                    (color) => 
                    <button className={`ui button ${color}`}>
                        <LanguageContext.Consumer>
                            {(value) => value === "english" ? "Submit" : "Voorleggen"}
                        </LanguageContext.Consumer>
                    </button>
                
                }

            </ColorContext.Consumer>
        );
    }
}

export default Button;