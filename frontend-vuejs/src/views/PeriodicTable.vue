<template>
  <div id="periodic-table">
    <h1 id="title">원소 주기율표(Periodic-Table)</h1>
    <div id="periodic-table-grid">
      <router-link
        v-for="atom in atomsProps"
        :key="atom.id"
        :to="{ name: 'AtomDetailInfo', params: { atomName: atom.atomName } }"
      >
        <atom-table-cell :atomName="atom.atomName" :atomNum="atom.atomNum" />
      </router-link>
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
    .cell-form {
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
      &:hover {
        box-shadow: 0px 0px 12px 2px rgb(182, 94, 0);
        transition-property: box-shadow;
        transition-duration: 180ms;
        transition-delay: 50ms;
        background-color: rgb(241, 153, 58);
        color: rgb(255, 255, 255);
      }
      a:link,
      a:visited,
      a:focus,
      a:hover {
        color: inherit;
      }
      .content {
        display: inline-flex;
        flex-direction: column;
        justify-content: space-evenly;
        width: 100%;
        height: 100%;
        position: relative;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);

        span {
          display: inline-block;
          width: 100%;
          text-align: center;
          color: inherit;
        }
        .atom-name {
          font-size: 130%;
        }
        .atom-num {
          font-size: 90%;
        }
      }
    }
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
    .cell-lanth {
      grid-column: 3;
      grid-row: 6;
      .content .atom-name,
      .content .atom-num {
        font-size: 8pt;
      }
    }
    .cell-actin {
      grid-column: 3;
      grid-row: 7;
      .content .atom-name,
      .content .atom-num {
        font-size: 8pt;
      }
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
