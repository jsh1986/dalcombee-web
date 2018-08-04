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
    <div id="cashlistapp">
        <img src="https://stickershop.line-scdn.net/stickershop/v1/sticker/26232145/ANDROID/sticker.png">
        <img src="https://stickershop.line-scdn.net/stickershop/v1/sticker/26232149/ANDROID/sticker.png">
        <img src="https://stickershop.line-scdn.net/stickershop/v1/sticker/26232148/ANDROID/sticker.png">
        <div id="header" class="header">
            <h2>Cash Receipt List</h2>
            <input-cash />
        </div>
        <list></list>
    </div>
</template>
<script type="text/javascript">
import InputCash from './InputCash.vue';
import List from './List.vue';

export default {
    name : 'cash-list',
    components : { InputCash, List }
}
</script>
