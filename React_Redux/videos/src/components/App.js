import React from 'react';
import SearchBar from "./SearchBar";
import youtube from "../apis/youtube";
import VideoList from "./VideoList";
import VideoDetail from "./VideoDetail";

class App extends React.Component{

    state = { 
        videos: [],
        selectedVideo: null
    };

    componentDidMount(){
        this.onTermSubmitCallBack("dota");
    }

    onVideoSelectCallBack = (video) => {
        this.setState({
            selectedVideo: video
        });
    }

    onTermSubmitCallBack = async (term) => {
        const response = await youtube.get("/search", {
            params: {
                q: term
            }
        });

        this.setState({
            videos: response.data.items,
            selectedVideo: response.data.items[0]
        });
    }

    render(){

        return(
            <div className="ui container"> 
                <SearchBar onFormSubmit={this.onTermSubmitCallBack} />
                <div className="ui grid">
                    <div className="row">
                        <div className="eleven wide column">
                            <VideoDetail video={this.state.selectedVideo}/>                        
                        </div>
                        <div className="five wide column">
                            <VideoList 
                                onVideoSelect={this.onVideoSelectCallBack} 
                                videos={this.state.videos} 
                            />
                        </div>

                    </div>


                </div>


            </div>
        ); 
    
    }
}

export default App;