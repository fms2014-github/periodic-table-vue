<template>
  <div class="atom-table-cell">
    <span class="atom-name">{{ atomName }}</span>
    <span class="atom-num">{{ atomNum }}</span>
  </div>
</template>

<script>
export default {
  props: {
    atomName: {
      type: String,
      required: true,
    },
    atomNum: {
      type: String,
      required: true,
    },
  },
};
</script>

<style lang="scss" scoped>
.atom-table-cell{
  display: inline-block;
  width: 100%;
  height: 100%;
  border-width: 2px;
  border-style: solid;
  border-color: rgb(255, 149, 11);
  border-radius: 10px;
  background-color: white;
  color: rgb(223, 122, 11);
  box-shadow: 0px 0px 12px 2px rgba(182, 148, 111, 0.726);
  span{
      display:inline-block;
      width: 100%;
      text-align: center;
      color:inherit;
  }           
  .atom-name{
      font-size: 130%;
      
  }
  .atom-num{
      font-size: 90%;
  }
}
</style>
