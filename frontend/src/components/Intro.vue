<template>
  <div class="hello">
    <img src="https://stickershop.line-scdn.net/stickershop/v1/product/1840992/LINEStorePC/main@2x.png">
    <h1>Helo</h1>
    <br />
    <!--
    <ul>
      <li>'Todo List' page : </li>
      <li><router-link :to="{ name: 'TodoList' }" exact target="_blank">/todo</router-link></li>
    </ul>
  -->
    <br />
    <br />
    <h5>'Todo List' page : <router-link :to="{ name: 'TodoList' }" exact target="_blank">/todo</router-link></h5>
    <h5>'Cash List' page : <router-link :to="{ name: 'CashList' }" exact target="_blank">/cash</router-link></h5>
    <br />
    <h5>You can see <a href="https://store.line.me/stickershop/product/1840992/en" target="_blank">LINE Sticker!!</a></h5>
  </div>
</template>

<script>
export default {
  name: 'hello'
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
