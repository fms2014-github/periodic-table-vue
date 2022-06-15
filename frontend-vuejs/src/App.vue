<template>
  <div id="app">
    <periodic-table/>
    <atom-detail-info/>
  </div>
</template>

<script>
import PeriodicTable from './views/PeriodicTable.vue'
import AtomDetailInfo from './views/AtomDetailInfo.vue'

export default {
    components:{
        PeriodicTable,
        AtomDetailInfo
    }
}
</script>

<style lang="scss">
body{ 
    overflow: overlay;
} 
::-webkit-scrollbar { 
    width: 10px; 
    height: 10px;
}
body::-webkit-scrollbar-thumb {
    background-color: hsla(0, 0%, 42%, 0.49);
    border-radius: 100px;
    border: {
        width: 4px;
        style: solid;
        color: rgba(0,0,0,0)
    };
}

body, div, h1{
    margin: 0px;
    padding: 0px;
    height: auto;
}

</style>
