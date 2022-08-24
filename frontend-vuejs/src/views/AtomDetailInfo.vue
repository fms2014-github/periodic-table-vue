<template>
  <div class="atom-detail-info">
    <light-box>
      <atom-icon
        :atomName="periodic.atomName"
        :atomNum="periodic.atomNum"
        :atomFullName="periodic.atomFullName"
      />
      <atom-info :atomInfo="periodic.atomInfo" />
    </light-box>
  </div>
</template>

<script>
import LightBox from "@/components/LightBox.vue";
import AtomIcon from "@/components/AtomIcon.vue";
import AtomInfo from "@/components/AtomInfo.vue";
import axios from "axios";

export default {
  data() {
    return {
      periodic: {
      }
    };
  },
  components: {
    LightBox,
    AtomIcon,
    AtomInfo,
  },
  mounted() {
    let vm = this;

    axios.post("http://localhost:8080/api/v1/atom/detail/" + this.$route.params.atomName).then(function (res) {
      let axiosData = res.data;

     Object.keys(axiosData).forEach((key) => {
      vm.$set(vm.$data.periodic, key, axiosData[key]);
     });
    });

    console.log(vm.periodic);
  }
};
</script>

<style lang="scss" scoped>

</style>
