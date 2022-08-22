<template>
  <div class="atom-detail-info">
    <light-box>
      <atom-icon
        :atomName="atomName"
        :atomNum="atomNum"
        :atomFullName="atomFullName"
      />
      <atom-info :atomInfo="atomInfo" />
    </light-box>
  </div>
</template>

<script>
import LightBox from "@/components/LightBox.vue";
import AtomIcon from "@/components/AtomIcon.vue";
import AtomInfo from "@/components/AtomInfo.vue";

export default {
  data: () => {
    return {
      atomName: "",
      atomNum: "",
      atomFullName: "",
      atomInfo: "",
    };
  },
  components: {
    LightBox,
    AtomIcon,
    AtomInfo,
  },
  mounted(){
    this.atomName = this.$route.params.atomName;
    console.log("AtomDetailInfo", this.$route.params);
  }
};
</script>

<style lang="scss" scoped>

</style>
