export default (state = [], action) => {
    //bad examples
    //return document.querySelector("#input");
    
    //based on the reducer input data

    //return state + action
    /*
    if(action.type === "FETCH_POSTS"){
        return action.payload;
    }
    */
 
    switch(action.type)
    {
        case "FETCH_POSTS":
            return action.payload;
        default:
            return state;

    }

}