<template>
  <div id="app">
    <periodic-table :atomsProps="atomData"/>
    <router-view class="lightbox-background" name="AtomDetailInfo" />
  </div>
</template>

<script>
import PeriodicTable from "./views/PeriodicTable.vue";
import axios from "axios";

export default {
  data(){
    return{
      atomData: []
    }
  },
  components: {
    PeriodicTable,
  },
  async mounted() {
    let getAtomData = (await axios.post("http://localhost:8080/api/v1/atom/table/list")).data;

    this.atomData = getAtomData.tableData;
  },
};
</script>

<style lang="scss" scoped>
body {
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
    color: rgba(0, 0, 0, 0);
  }
}

.lightbox-background{
  position: absolute;
  top: 0px;
  width: #{$backgroundWdith};
  height: 100vh;
  background-color: rgba(50,50,50,0.65);
}

</style>
