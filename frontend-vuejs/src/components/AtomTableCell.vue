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
  display: inline-flex;
  flex-direction: column;
  justify-content: space-evenly;
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
      line-height: 90%;
  }
  .atom-num{
      font-size: 90%;
      line-height: 130%;
  }

  &:hover{
    box-shadow: 0px 0px 12px 2px rgb(182, 94, 0);
    transition-property: box-shadow;
    transition-duration: 180ms;
    transition-delay: 50ms;
    background-color: rgb(241, 153, 58);
    color: rgb(255,255,255);
  }
  
}

.cell-lanth {
  grid-column: 3;
  grid-row: 6;
  .atom-name,
  .atom-num {
    font-size: 8pt;
    line-height: 8pt;
  }
}
.cell-actin {
  grid-column: 3;
  grid-row: 7;
  .atom-name,
  .atom-num {
    font-size: 8pt;
    line-height: 8pt;
    vertical-align: middle;
  }
}
</style>
