<template>
  <div id="app">
    <Login/>
  </div>
</template>
<script>
import Login from '@/components/Login'
export default{
  name:'App',
  components:{
    Login
  }
}
</script>


<style>
#app {
  position: absolute;;
  top: 50px;
  right: 100px;
  left: 100px;
  bottom: 0;
  text-align: center;
  color: #2c3e50;
}

</style>
