<style>
    * {  box-sizing: border-box;  }
    .header {
        background-color: black;
        padding: 30px 30px;
        color: blue; text-align: center;
    }
    .header:after {
        content: ""; display: table; clear: both;
    }
    img {width:100px;}
</style>
<template>
    <div id="todolistapp">
        <img src="https://stickershop.line-scdn.net/stickershop/v1/sticker/26232145/ANDROID/sticker.png">
        <img src="https://stickershop.line-scdn.net/stickershop/v1/sticker/26232149/ANDROID/sticker.png">
        <img src="https://stickershop.line-scdn.net/stickershop/v1/sticker/26232148/ANDROID/sticker.png">
        <div id="header" class="header">
            <h2>Todo List</h2>
            <input-todo />
        </div>
        <list></list>
    </div>
</template>
<script type="text/javascript">
import InputTodo from './InputTodo.vue';
import List from './List.vue';

export default {
    name : 'todo-list',
    components : { InputTodo, List }
}
</script>
