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
            atoms:[{}]
        }
    },
    components:{
        AtomTableCell
    }
}
</script>

<style>

</style>