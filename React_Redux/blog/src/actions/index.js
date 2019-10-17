import _ from "lodash";
import jsonPlaceholder from "../apis/jsonPlaceholder";

// refer to motivation section in https://github.com/reduxjs/redux-thunk/blob/master/README.md
export const fetchPostsAndUsers = () => async (dispatch, getState) => {
    await dispatch(fetchPosts());

    _.chain(getState().posts)
        .map("userId")
        .uniq()
        .forEach(id => dispatch(fetchUser(id)))
        .value();
};


export const fetchPosts = () => {
    return async (dispatch) => {
        const response = await jsonPlaceholder.get("/posts");
        
        dispatch({
            type: "FETCH_POSTS",
            payload: response.data
        });
    };
};

export const fetchUser = id => async dispatch => {
    const response = await jsonPlaceholder.get(`/users/${id}`);
    
    dispatch({
        type: "FETCH_USER", 
        payload: response.data
    });
};

