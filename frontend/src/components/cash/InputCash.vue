<style>
* {  box-sizing: border-box;  }
.input {
    border: none; width: 75%; height:35px; padding: 10px;
    float: left; font-size: 16px;
}
.addbutton {
    padding: 10px; width: 25%; height:35px; background: #d9d9d9;
    color: #555; float: left; text-align: center;
    font-size: 13px; cursor: pointer; transition: 0.3s;
}
.addbutton:hover { background-color: #bbb; }
</style>
<template>
    <div>
        <input class="input" type="text" id="task" v-model.trim="title"
            placeholder="입력 후 엔터!" v-on:keyup.enter="addCash">
        <span class="addbutton" v-on:click="addCash">추 가</span>
    </div>
</template>
<script type="text/javascript">
import Constant from '../../constant'

export default {
    name : 'input-cash',
    data : function() {
        return { title : "" }
    },
    methods : {
        addCash : function() {
            this.$store.dispatch(Constant.ADD_CASH, { title: this.title });
            this.title = "";
        },
        loadListCash : function() {
            this.$store.dispatch(Constant.LOAD_LIST_CASH, { });
        }
    }
}
</script>
