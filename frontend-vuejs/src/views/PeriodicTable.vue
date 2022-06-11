<template>
    <div id="periodic-table">
        <h1 id="title">원소 주기율표(Periodic-Table)</h1>
        <div id="periodic-table-grid">
            <atom-table-cell v-for="atom in atoms" :key="atom.id" :atomName="atom.atomName" :atomNum="atom.atomNum"/>
        </div>
    </div>
</template>

<script>
import AtomTableCell from '../components/AtomTableCell.vue'

export default {
    data:() => {
        return {
            atoms:[]
        }
    },
    components:{
        AtomTableCell
    }
}
</script>

<style lang="scss">
#periodic-table{
    display:inline-flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    width:100vw;
    height:100vh;
    min-width: $backgroundWdith;
    min-height: $backgroundHeight;
    background: linear-gradient(60deg, rgb(255, 176, 72), rgb(253, 218, 177));
    
    #title{
        margin-bottom: 60px;
        font: {
            size: 28pt;
            family: 'NanumBarunGothic';
        }
        color: rgb(189, 82, 20);
    }

    #periodic-table-grid{
        display: inline-grid;
        padding: 12px;
        grid-template-columns: repeat(18, #{$gridColumnWidth}px);
        grid-template-rows: repeat(9, #{$gridColumnWidth}px);
        grid-gap: 10px;
    }
}
</style>