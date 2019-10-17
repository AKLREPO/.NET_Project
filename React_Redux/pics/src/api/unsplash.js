import axios from 'axios';

export default axios.create({
    baseURL: "https://api.unsplash.com",
    headers:{
        Authorization: "Client-ID f213d37263445bb00ac0c577929812d6c5fa01ce254e2356800f8fe892a05e79"
    }
});