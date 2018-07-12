import Constant from '../constant';
import moment from 'moment';

export default {
    [Constant.ADD_TODO] : (state, payload) => {
        if (payload.todo !== "") {
            state.todolist.push({ no:payload.no, title:payload.title, done:payload.done, createdAt:moment(payload.createdAt).format(Constant.FORMAT_DISPLAY_TIME) });
        }
    },
    [Constant.DONE_TOGGLE] : (state, payload) => {
        console.log("# mutaions. DONE_TOGGLE. payload:" + payload);
        console.log("# mutaions. DONE_TOGGLE. payload.responseData:" + payload.responseData);
        console.log("# mutaions. DONE_TOGGLE. payload.responseData.done:" + payload.responseData.done);
        console.log("# mutaions. DONE_TOGGLE. payload.index:" + payload.index);
        state.todolist[payload.index].done =  payload.responseData.done;
    },
    [Constant.DELETE_TODO] : (state,payload) => {
        state.todolist.splice(payload.index,1);
    },
    [Constant.LOAD_LIST_TODO] : (state,payload) => {
        state.todolist = [];
        for (const item of payload) {
          console.log("item.no:" + item.no);
          console.log("item.title:" + item.title);
          state.todolist.push({ no:item.no, title:item.title, done:item.done, createdAt:moment(item.createdAt).format(Constant.FORMAT_DISPLAY_TIME) });
        }
    }
}
