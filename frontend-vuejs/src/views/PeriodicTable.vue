<template>
  <div id="periodic-table">
    <h1 id="title">원소 주기율표(Periodic-Table)</h1>
    <div id="periodic-table-grid">
      <router-link
        v-for="atom in atomsProps"
        :key="atom.id"
        :to="{ name: 'AtomDetailInfo', params: { atomName: atom.atomName } }"
        :class="otherAtom(atom.atomNum)"
      >
        <atom-table-cell :atomName="atom.atomName" :atomNum="atom.atomNum" />
      </router-link>
      <atom-table-cell class="cell-lanth" :atomName="'Lanthanoids'" :atomNum="'57 ~ 71'" />
      <atom-table-cell class="cell-actin" :atomName="'Actinoids'" :atomNum="'89 ~ 103'" />
    </div>
  </div>
</template>

<script>
import AtomTableCell from "../components/AtomTableCell.vue";

export default {
  props:['atomsProps'],
  data() {
    return {
      
    };
  },
  methods: {
    otherAtom(atomNum){
      if(atomNum >= 57 && atomNum <= 71){
        return "cell-lanth-"+(atomNum - 56)
      }else if(atomNum >= 89 && atomNum <= 103){
        return "cell-actin-"+(atomNum - 88)
      }else{
        return "cell-"+atomNum;
      }
    }
  },
  components: {
    AtomTableCell,
  },
};
</script>

<style lang="scss" scoped>
#periodic-table {
  display: inline-flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100vw;
  height: 100vh;
  min-width: $backgroundWdith;
  min-height: $backgroundHeight;
  background: linear-gradient(60deg, rgb(255, 176, 72), rgb(253, 218, 177));

  #title {
    margin-bottom: 60px;
    font: {
      size: 28pt;
      family: "NanumBarunGothic";
    }
    color: rgb(189, 82, 20);
  }

  #periodic-table-grid {
    display: inline-grid;
    padding: 12px;
    grid-template-columns: repeat(18, #{$gridColumnWidth}px);
    grid-template-rows: repeat(9, #{$gridColumnWidth}px);
    grid-gap: 10px;

    $column: 1;
    $row: 1;
    $atom-num: 1;
    @while $row <= 7 {
      @while $column <= 18 {
        @if $atom-num == 2 {
          .cell-#{$atom-num} {
            grid-column: 18;
            grid-row: $row;
            $column: 19;
          }
        } @else if $atom-num == 4 or $atom-num == 12 {
          .cell-#{$atom-num} {
            $column: 12;
            cursor: pointer;
            grid-column: 2;
            grid-row: $row;
          }
        } @else if
          ($atom-num >= 57 and $atom-num <= 71) or
          ($atom-num >= 89 and $atom-num <= 103)
        {
          $column: 3;
        } @else {
          .cell-#{$atom-num} {
            cursor: pointer;
            grid-column: $column;
            grid-row: $row;
          }
        }
        $column: $column + 1;
        $atom-num: $atom-num + 1;
      }
      $column: 1;
      $row: $row + 1;
    }

    $atom-num: 1;
    @while $atom-num <= 15 {
      .cell-lanth-#{$atom-num} {
        grid-column: $atom-num + 2;
        grid-row: 8;
      }
      .cell-actin-#{$atom-num} {
        grid-column: $atom-num + 2;
        grid-row: 9;
      }
      $atom-num: $atom-num + 1;
    }
  }

  a:link,
  a:visited,
  a:focus,
  a:hover {
    color: inherit;
    text-decoration: none;
  }
}
</style>
