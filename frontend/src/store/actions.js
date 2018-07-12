import Constant from '../constant';
// import axios from 'axios'
import {AXIOS} from '../components/http-common'

export default {
    [Constant.ADD_TODO] : ({ state, commit }, payload) => {
        console.log("###[action] addTodo!!!");
        var params = new URLSearchParams();
        params.append('title', payload.title);

        AXIOS.post(`/todo`, params)
        .then(response => {
          commit(Constant.ADD_TODO, response.data);
        })
        .catch(e => {
          this.errors.push(e);
        })
    },
    [Constant.DELETE_TODO] : (store, payload) => {
        console.log("###[action] deleteTodo!!!");

        AXIOS.delete(`/todo/` + payload.no)
        .then(response => {
          store.commit(Constant.DELETE_TODO, payload);
        })
        .catch(e => {
          this.errors.push(e);
        })
    },
    [Constant.DONE_TOGGLE] : (store, payload) => {
        console.log("###[action] doneToggle!!!");

        AXIOS.post(`/todo/` + payload.no + `/toggle`)
        .then(response => {
          store.commit(Constant.DONE_TOGGLE, {responseData:response.data, index:payload.index});
        })
        .catch(e => {
          console.log("DONE_TOGGLE. catched e:" + e);
          this.errors.push(e);
        })
    },
    [Constant.LOAD_LIST_TODO] : (store, payload) => {
        console.log("###[action] load list todo!!!");
        AXIOS.get(`/todo/all`)
          .then(response => {
            store.commit(Constant.LOAD_LIST_TODO, response.data);
          })
          .catch(e => {
            this.errors.push(e);
          })
    }
}
