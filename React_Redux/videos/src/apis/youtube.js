import axios from "axios";

const KEY = "AIzaSyAE0k_6DNy2XJe-_TmEdJDFNdOzL0DatTM";

export default axios.create({
    baseURL: "https://www.googleapis.com/youtube/v3",
    params: {
        part: "snippet",
        maxResults: 5,
        key: KEY
    }
});
