<template>
  <div id="app">
    <periodic-table/>
  </div>
</template>

<script>
import PeriodicTable from './views/PeriodicTable.vue'

export default {
    components:{
        PeriodicTable
    }
}
</script>

<style lang="scss">
@use "sass:math";
@import url("https://cdn.jsdelivr.net/gh/moonspam/NanumBarunGothic@latest/nanumbarungothicsubset.css");

/* scss Variables */
$gridColumnWidth: 60;
$gridRowWidth: 60;
$columnCount: 18;
$rowCount: 9;
$backgroundWdith: ($gridColumnWidth * $columnCount) + ($columnCount - 1) * 10 + 24px;
$backgroundHeight: ($gridRowWidth * $rowCount) +($rowCount - 1) * 10 + 244px;
/* scss Variables */
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
